package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PcMstr
 * @author MyEclipse Persistence Tools
 */

public class PcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PcMstr transientInstance) {
		log.debug("saving PcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PcMstr persistentInstance) {
		log.debug("deleting PcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PcMstr findById(com.gopawpaw.erp.hibernate.p.PcMstrId id) {
		log.debug("getting PcMstr instance with id: " + id);
		try {
			PcMstr instance = (PcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PcMstr instance) {
		log.debug("finding PcMstr instance by example");
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
		log.debug("finding PcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PcMstr instances");
		try {
			String queryString = "from PcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PcMstr merge(PcMstr detachedInstance) {
		log.debug("merging PcMstr instance");
		try {
			PcMstr result = (PcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PcMstr instance) {
		log.debug("attaching dirty PcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PcMstr instance) {
		log.debug("attaching clean PcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PcMstrDAO) ctx.getBean("PcMstrDAO");
	}
}