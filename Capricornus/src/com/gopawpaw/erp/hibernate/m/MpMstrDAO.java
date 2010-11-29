package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MpMstr
 * @author MyEclipse Persistence Tools
 */

public class MpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MpMstr transientInstance) {
		log.debug("saving MpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MpMstr persistentInstance) {
		log.debug("deleting MpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MpMstr findById(com.gopawpaw.erp.hibernate.m.MpMstrId id) {
		log.debug("getting MpMstr instance with id: " + id);
		try {
			MpMstr instance = (MpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MpMstr instance) {
		log.debug("finding MpMstr instance by example");
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
		log.debug("finding MpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MpMstr instances");
		try {
			String queryString = "from MpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MpMstr merge(MpMstr detachedInstance) {
		log.debug("merging MpMstr instance");
		try {
			MpMstr result = (MpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MpMstr instance) {
		log.debug("attaching dirty MpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MpMstr instance) {
		log.debug("attaching clean MpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MpMstrDAO) ctx.getBean("MpMstrDAO");
	}
}