package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PjtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PjtMstr
 * @author MyEclipse Persistence Tools
 */

public class PjtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PjtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PjtMstr transientInstance) {
		log.debug("saving PjtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PjtMstr persistentInstance) {
		log.debug("deleting PjtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PjtMstr findById(com.gopawpaw.erp.hibernate.p.PjtMstrId id) {
		log.debug("getting PjtMstr instance with id: " + id);
		try {
			PjtMstr instance = (PjtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PjtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PjtMstr instance) {
		log.debug("finding PjtMstr instance by example");
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
		log.debug("finding PjtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PjtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PjtMstr instances");
		try {
			String queryString = "from PjtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PjtMstr merge(PjtMstr detachedInstance) {
		log.debug("merging PjtMstr instance");
		try {
			PjtMstr result = (PjtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PjtMstr instance) {
		log.debug("attaching dirty PjtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PjtMstr instance) {
		log.debug("attaching clean PjtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PjtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PjtMstrDAO) ctx.getBean("PjtMstrDAO");
	}
}