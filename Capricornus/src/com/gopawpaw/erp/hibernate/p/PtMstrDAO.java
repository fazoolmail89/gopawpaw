package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtMstr
 * @author MyEclipse Persistence Tools
 */

public class PtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtMstr transientInstance) {
		log.debug("saving PtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtMstr persistentInstance) {
		log.debug("deleting PtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtMstr findById(com.gopawpaw.erp.hibernate.p.PtMstrId id) {
		log.debug("getting PtMstr instance with id: " + id);
		try {
			PtMstr instance = (PtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtMstr instance) {
		log.debug("finding PtMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtMstr instances");
		try {
			String queryString = "from PtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtMstr merge(PtMstr detachedInstance) {
		log.debug("merging PtMstr instance");
		try {
			PtMstr result = (PtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtMstr instance) {
		log.debug("attaching dirty PtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtMstr instance) {
		log.debug("attaching clean PtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtMstrDAO) ctx.getBean("PtMstrDAO");
	}
}